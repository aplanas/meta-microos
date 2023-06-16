SUMMARY = "A SCAP scanner and SCAP content editor"
DESCRIPTION = "The main goal of this application is to lower the initial barrier of \
using SCAP. Therefore, the scope of very narrow - scap-workbench only \
scans a single machine and only with XCCDF/SDS (no direct OVAL \
evaluation). The assumption is that this is enough for users who want \
to scan a few machines and users with huge amount of machines to scan \
will just use scap-workbench to test or hand-tune their content before \
deploying it with more advanced (and harder to use) tools like \
spacewalk."
LICENSE = "GPL-3.0-only"

PV = "1.2.1+git20221219.10c1929"

RPM_NAME = "scap-workbench-1.2.1+git20221219.10c1929-1.1.aarch64.rpm"
RPM_HASH = "98c071caf3484dde5e93c8ce90f065f132d794bebb9949c336ace6d4815a8de8a5142fb3ab303b42bcdbdcf31a786bf714d7173379343e41bc06babafe25040c"

RPROVIDES:${PN} += "scap-workbench"

RDEPENDS:${PN} += "/usr/bin/bash \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libopenscap.so.25 \
libstdc++.so.6"

inherit rpm
