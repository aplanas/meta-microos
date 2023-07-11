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

RPM_NAME = "python39-w3lib-1.22.0-3.5.noarch.rpm"
RPM_HASH = "70928ae15c393b2fbf831c9318b8d37805f2400221347397b741dc2a6ae4e1888282a8d9f0fb1fc1cf227a9010df8fb0dbe0ffde8b13454f1431b036af50d716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-w3lib \
python39-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
