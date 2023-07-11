SUMMARY = "Mach-O header analysis and editing"
DESCRIPTION = "macholib can be used to analyze and edit Mach-O headers, the executable \
format used by Mac OS X. \
 \
It's typically used as a dependency analysis tool, and also to rewrite dylib \
references in Mach-O headers to be @executable_path relative. \
 \
Though this tool targets a platform specific file format, it is pure python \
code that is platform and endian independent."
LICENSE = "MIT"

PV = "1.16.2"

RPM_NAME = "python311-macholib-1.16.2-2.3.noarch.rpm"
RPM_HASH = "7f862a9ea4b466fba2f50ad888eab03a568e7031918291c59bea22897d79718e3a4839182c0e67f7f47bdea1e16adc940a002fd361808fe0d1183e17043c70f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-macholib \
python3.11dist-macholib \
python311-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-altgraph \
python311-setuptools \
update-alternatives"

inherit rpm
