SUMMARY = "Library of Web-Related Functions"
DESCRIPTION = "This is a Python library of web-related functions, such as: \
 \
* remove comments, or tags from HTML snippets \
 \
* extract base url from HTML snippets \
 \
* translate entites on HTML strings \
 \
* encoding mulitpart/form-data \
 \
* convert raw HTTP headers to dicts and vice-versa \
 \
* construct HTTP auth header \
 \
* converting HTML pages to unicode \
 \
* RFC-compliant url joining \
 \
* sanitize urls (like browsers do) \
 \
* extract arguments from urls"
LICENSE = "BSD-3-Clause"

PV = "1.22.0"

RPM_NAME = "python310-w3lib-1.22.0-3.5.noarch.rpm"
RPM_HASH = "84f7c3b71068c8954e76e16403b8989d0aee94f29dc29a09024b8630e86a688805916e4643fd72e8e4d4914542f808f4f1f95239c44da71fc46140ea22f4134d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-w3lib \
python310-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
