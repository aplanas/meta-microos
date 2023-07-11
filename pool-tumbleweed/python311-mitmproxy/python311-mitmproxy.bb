SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python311-mitmproxy-9.0.1-1.5.noarch.rpm"
RPM_HASH = "b65a4158f1f9a8954ec14bef83b2d761699161cafa1f13197f887b246185c6a8da759db1241dd1d1db8acbe8b0173ead819ad823cd679728aac2c513f4dddd9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mitmproxy \
python3.11dist-mitmproxy \
python311-mitmproxy \
python3dist-mitmproxy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Brotli \
python311-Flask \
python311-asgiref \
python311-certifi \
python311-click \
python311-cryptography \
python311-h11 \
python311-h2 \
python311-hyperframe \
python311-kaitaistruct \
python311-ldap3 \
python311-mitmproxy-wireguard \
python311-msgpack \
python311-passlib \
python311-protobuf \
python311-publicsuffix2 \
python311-pyOpenSSL \
python311-pyparsing \
python311-pyperclip \
python311-ruamel.yaml \
python311-sortedcontainers \
python311-tornado \
python311-urwid \
python311-wsproto \
python311-zstandard \
update-alternatives"

inherit rpm
