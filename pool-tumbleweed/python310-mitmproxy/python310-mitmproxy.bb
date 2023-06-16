SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python310-mitmproxy-9.0.1-1.3.noarch.rpm"
RPM_HASH = "6ec98b398f9f6eeead42d1b270e31230b6b70e03e3f30d57cfbb3557eb4a70a5e9a6c33c45cda092f19c65fe01f2132105dc71f9fbfef32ac83e8a5c70d216ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mitmproxy \
python3.10dist-mitmproxy \
python310-mitmproxy \
python3dist-mitmproxy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Brotli \
python310-Flask \
python310-asgiref \
python310-certifi \
python310-click \
python310-cryptography \
python310-h11 \
python310-h2 \
python310-hyperframe \
python310-kaitaistruct \
python310-ldap3 \
python310-mitmproxy-wireguard \
python310-msgpack \
python310-passlib \
python310-protobuf \
python310-publicsuffix2 \
python310-pyOpenSSL \
python310-pyparsing \
python310-pyperclip \
python310-ruamel.yaml \
python310-sortedcontainers \
python310-tornado \
python310-urwid \
python310-wsproto \
python310-zstandard \
update-alternatives"

inherit rpm
