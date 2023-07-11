SUMMARY = "Software speech synthesizer (text-to-speech) -- Development Files"
DESCRIPTION = "eSpeak is a compact open source software speech synthesizer for English \
and other languages. \
 \
eSpeak uses a 'formant synthesis' method. This allows many languages to \
be provided in a small size. The speech is clear, and can be used at \
high speeds, but is not as natural or smooth as larger synthesizers \
which are based on human speech recordings."
LICENSE = "GPL-3.0+"

PV = "1.48.04"

RPM_NAME = "espeak-devel-1.48.04-6.27.aarch64.rpm"
RPM_HASH = "8c7bd3b5617ce1478922417de391615d2a69b20ff08b56fb26ae0aa6ffecd312dd1499ba8c661933a0a20e1469b44140eafd723361b86097f045c5beea501ca0"

RPROVIDES:${PN} += "espeak-devel"

RDEPENDS:${PN} += "espeak"

inherit rpm
