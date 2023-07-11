SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python39-mitmproxy-9.0.1-1.5.noarch.rpm"
RPM_HASH = "ddadb5a42eff41932743aaa3c153dfd9aa3728dd9533736dc7bc9d6a8e7948d8e05f86ef781ef9e6769cadc51d53b327f2bd8918e928a4b6b21e985740707c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mitmproxy \
python39-mitmproxy \
python3dist-mitmproxy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Brotli \
python39-Flask \
python39-asgiref \
python39-certifi \
python39-click \
python39-cryptography \
python39-h11 \
python39-h2 \
python39-hyperframe \
python39-kaitaistruct \
python39-ldap3 \
python39-mitmproxy-wireguard \
python39-msgpack \
python39-passlib \
python39-protobuf \
python39-publicsuffix2 \
python39-pyOpenSSL \
python39-pyparsing \
python39-pyperclip \
python39-ruamel.yaml \
python39-sortedcontainers \
python39-tornado \
python39-typing-extensions \
python39-urwid \
python39-wsproto \
python39-zstandard \
update-alternatives"

inherit rpm
