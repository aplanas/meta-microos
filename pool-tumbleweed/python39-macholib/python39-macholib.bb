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

RPM_NAME = "python39-macholib-1.16.2-2.3.noarch.rpm"
RPM_HASH = "da0bc596f230b9d1479b3669b2d7917ad826b517015a48a8be2fa024a822fc715b0674ee38d1b15ccc36a2f61c69259d2a4ddceff2d102053eb1b5b9168933a9"
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
