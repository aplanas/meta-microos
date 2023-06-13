SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua53-fluent-0.2.0-2.1.noarch.rpm"
RPM_HASH = "c71746723af68a3b08fc1547f31b8146bcc938514d30091b602d26f0d5bda248791b0b4f1e5d1d19a1fae03b0facbe14ea90bc7ec8507d2910a58f17cd9b66bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-fluent"

RDEPENDS:${PN} += "lua53 \
lua53-cldr \
lua53-luaepnf \
lua53-penlight"

inherit rpm
