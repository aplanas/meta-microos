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

RPM_NAME = "python39-macholib-1.16.2-1.4.noarch.rpm"
RPM_HASH = "69686de23ffefc5a5e922501526223843d524e5033b33bb45b98532e2bf6757213cffd3b397962ad5b01863ccf49bda006b80d842dcca9a50555c4ecbfaf0c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-macholib \
python39-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-altgraph \
python39-setuptools \
update-alternatives"

inherit rpm
