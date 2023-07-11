SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python311-musicbrainzngs-0.7.1-2.8.noarch.rpm"
RPM_HASH = "4d8929055a73f1accfc97ccb6ebc9eb18b5ad0221be12c50d293db7830a70143203eb64e7f9bdb3858735b340815d6de605072dc0bd3772653bb8ad1f35b4524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-musicbrainzngs \
python3.11dist-musicbrainzngs \
python311-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
