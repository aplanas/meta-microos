SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python310-mitmproxy-9.0.1-1.5.noarch.rpm"
RPM_HASH = "5e80613c94884836f42fa459a5fd014aa2f0129b661c87938e3f1e20f3702b9ad9a3affff0f1945d3dad89a39459ab8ce51f8115972d5d30b5c13f47d71ae847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mitmproxy \
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
