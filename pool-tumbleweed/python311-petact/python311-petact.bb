SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-petact-0.1.2-3.13.noarch.rpm"
RPM_HASH = "ba0518fbb8bcf49c75a177d57ff591a849f25af04f604eb2bb62194c9d533b96287289325f74b646ea5f80c6874d208eee018acb13e12faa924eebb438a80bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(petact) \
python311-petact \
python3dist(petact)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
