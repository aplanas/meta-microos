SUMMARY = "A TUI for Mastodon with vim inspired keys"
DESCRIPTION = "tut is a TUI for Mastodon with vim inspired keys. TUI is an acronym for text-based user interface, so tut runs in your terminal."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "tut-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "6be2c8d532fedc59ca9ed7e5350338bcddace8c5689f91399e09000b23915af4f85429383f87fda17cbff3e1180c76f8a4d5e092854d1bf80bfb39311e562417"

RPROVIDES:${PN} += "tut"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
