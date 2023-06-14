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

RPM_NAME = "python39-w3lib-1.22.0-3.3.noarch.rpm"
RPM_HASH = "5be204ec0bfdbaeb2363e003f96a5330590b5760b8682b49c5b7071ff4c0660f3ec7b3849daba4c4a6bbef08b56d89523012c47547df62037ae03902ad639c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-w3lib \
python39-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
