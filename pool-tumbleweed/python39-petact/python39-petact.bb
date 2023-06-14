SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-petact-0.1.2-3.13.noarch.rpm"
RPM_HASH = "827ff9ab561bdaafc3d7f4fcc5acec839f24cab2fdca29546afed42bf7074675d50e7f6b14f00cdcbf27afdff94d2b124d351c2a0d71532b3dc43c10a865bfe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-petact \
python39-petact \
python3dist-petact"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
