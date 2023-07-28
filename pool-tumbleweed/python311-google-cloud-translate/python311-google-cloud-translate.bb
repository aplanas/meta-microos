SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.2"

RPM_NAME = "python311-google-cloud-translate-3.11.2-1.1.noarch.rpm"
RPM_HASH = "cbfb11fe72f24f5d3063e07414d98c29819f21f92b310c24093c2fdecf9765454e5283f39d83af551a674cdf281079cdf502e8146b83b5f7f02385d300bdb1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-translate \
python3.11dist-google-cloud-translate \
python311-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-cloud-core \
python311-proto-plus \
python311-protobuf"

inherit rpm
