SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python310-musicbrainzngs-0.7.1-2.6.noarch.rpm"
RPM_HASH = "04769f26d9ff2b80397b3e86b5ba090f70cf088b4f44619fafce99b6aea7660ca0a86478664aa79786f8eccb45eaac5d38eff7ba84bf8e1c448f24879231e7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-musicbrainzngs \
python3.10dist-musicbrainzngs \
python310-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
