SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python311-premailer-3.10.0-1.5.noarch.rpm"
RPM_HASH = "416a7ba52afe38d9a96b225b3a154c5d966419364af6ec4906a91f4404b406bffac20df572e9f49501706eb12fb1e8ac139b4753cf121b37567a18ae3cdc2fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-premailer \
python3.11dist-premailer \
python311-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python311-cachetools \
python311-cssselect \
python311-cssutils \
python311-lxml \
python311-requests"

inherit rpm
