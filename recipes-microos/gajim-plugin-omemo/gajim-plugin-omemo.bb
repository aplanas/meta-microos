SUMMARY = "Gajim plugin for OMEMO Multi-End Message and Object Encryption"
DESCRIPTION = "This plugin adds support to Gajim for the OMEMO Encryption, an \
XMPP Extension Protocol (XEP) for secure multi-client end-to-end \
encryption based on Double Ratchet and PEP."
LICENSE = "GPL-3.0-only"

PV = "2.9.0"

RPM_NAME = "gajim-plugin-omemo-2.9.0-1.2.noarch.rpm"
RPM_HASH = "97ec22d6d3670176acfeec235226d9522b48319f71b843b72001f19f57a17bf7d6b376d2a92bf2df6445075b5a449706af367d6dd0f6a1ee03a058d1d32d982d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim-plugin-omemo"
RDEPENDS:${PN} += "gajim python310-axolotl python310-base python310-cryptography python310-protobuf"

inherit rpm
