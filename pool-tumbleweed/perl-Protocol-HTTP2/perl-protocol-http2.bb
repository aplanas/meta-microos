SUMMARY = "HTTP/2 protocol implementation (RFC 7540)"
DESCRIPTION = "Protocol::HTTP2 is HTTP/2 protocol implementation (at \
https://tools.ietf.org/html/rfc7540) with stateful decoders/encoders of \
HTTP/2 frames. You may use this module to implement your own HTTP/2 \
client/server/intermediate on top of your favorite event loop over plain or \
tls socket (see examples)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.10"

RPM_NAME = "perl-Protocol-HTTP2-1.10-2.3.noarch.rpm"
RPM_HASH = "f4c8a47272593310ac8376267772da1c978507551e8d30e0938a929ec639a65fc00540c34813fb9fc99aae49a602e940cd4f5a6f1c487dd20a1d2a9387e5db08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--HTTP2 \
perl-Protocol--HTTP2--Client \
perl-Protocol--HTTP2--Connection \
perl-Protocol--HTTP2--Constants \
perl-Protocol--HTTP2--Frame \
perl-Protocol--HTTP2--Frame--Continuation \
perl-Protocol--HTTP2--Frame--Data \
perl-Protocol--HTTP2--Frame--Goaway \
perl-Protocol--HTTP2--Frame--Headers \
perl-Protocol--HTTP2--Frame--Ping \
perl-Protocol--HTTP2--Frame--Priority \
perl-Protocol--HTTP2--Frame--Push-promise \
perl-Protocol--HTTP2--Frame--Rst-stream \
perl-Protocol--HTTP2--Frame--Settings \
perl-Protocol--HTTP2--Frame--Window-update \
perl-Protocol--HTTP2--HeaderCompression \
perl-Protocol--HTTP2--Huffman \
perl-Protocol--HTTP2--HuffmanCodes \
perl-Protocol--HTTP2--Server \
perl-Protocol--HTTP2--Server--Stream \
perl-Protocol--HTTP2--StaticTable \
perl-Protocol--HTTP2--Stream \
perl-Protocol--HTTP2--Trace \
perl-Protocol--HTTP2--Upgrade \
perl-Protocol-HTTP2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MIME--Base64"

inherit rpm
