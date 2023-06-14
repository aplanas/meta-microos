SUMMARY = "CLI/Terminal based gemini browser"
DESCRIPTION = "A fancy terminal browser for the Gemini protocol."
LICENSE = "GPL-3.0-only"

PV = "1.9.2"

RPM_NAME = "amfora-1.9.2-1.2.aarch64.rpm"
RPM_HASH = "c167633ed8ffcd0a210a8e6b8015b69b6ca0e6af4dfb66a0d436b7d0e28e4f8e2ea3e9c0e53b0af7bcb0944e78b985b0015dd87d7244808a99529ca8dd59af84"

RPROVIDES:${PN} += "amfora"

RDEPENDS:${PN} += ""

inherit rpm
