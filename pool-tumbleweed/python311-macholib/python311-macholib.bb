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

RPM_NAME = "python311-macholib-1.16.2-1.4.noarch.rpm"
RPM_HASH = "fdc1137de3c566f0d8f3319325dec9c154e866275c95f05ffaeaac234cfb279a6b75c054a155e0f58ff49f3ef28f31aad574059197b3c951a5355165edba2513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-macholib \
python311-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-altgraph \
python311-setuptools \
update-alternatives"

inherit rpm
