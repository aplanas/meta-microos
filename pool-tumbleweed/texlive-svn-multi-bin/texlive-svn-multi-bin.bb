SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "caed5b3745a6e7ddec8a88528c2a402c39068d229a0f7e251e4e603411b05b6c8e09c29017819b34bc4e60b8a8660b2a8550ca4dbd7c79d1553811109dae8abb"

RPROVIDES:${PN} += "texlive-svn-multi-bin"

RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm
