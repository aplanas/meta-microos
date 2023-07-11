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

RPM_NAME = "python311-w3lib-1.22.0-3.5.noarch.rpm"
RPM_HASH = "81df75e5b8bd7753008a2e4f200f857364f2272b12ba6c3fb5c5471899c4cb887dffbdde4907860392b459b8e8171644ce12d7b7aa33b2442e247aeb7c69ea43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-w3lib \
python3.11dist-w3lib \
python311-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
