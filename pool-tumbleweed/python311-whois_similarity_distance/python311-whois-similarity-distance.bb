SUMMARY = "Python module for calculating the WHOIS Similarity Distance"
DESCRIPTION = "This algorithm allows you to determine a numeric distance between two given domains, using their WHOIS information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-whois_similarity_distance-1.0.2-8.4.noarch.rpm"
RPM_HASH = "558f161fe932370d4d1e57cb6d8041996af0231b0ed4c14519df208a96d36d27ed8d52c639f0b8e0b70e9a25b7ffc252e106db7911526d05598c294668c9b19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whois-similarity-distance) \
python311-whois_similarity_distance \
python3dist(whois-similarity-distance)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Levenshtein \
python311-certifi \
python311-chardet \
python311-ez_setup \
python311-future \
python311-idna \
python311-numpy \
python311-python-dateutil \
python311-pythonwhois \
python311-requests \
python311-scikit-learn \
python311-scipy \
python311-six \
python311-texttable \
python311-tld \
python311-urllib3 \
update-alternatives"

inherit rpm
