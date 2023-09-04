SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0~git0.ae8ba1e"

RPM_NAME = "suseconnect-ruby-bindings-1.3.0~git0.ae8ba1e-1.1.aarch64.rpm"
RPM_HASH = "6d19489f58e80f93fe2316ee44d97817be721b452ba0542852a68edca599f2a54732ca7b47879fa545311c2ca80d872c0ca9c4821a73405e6a67dc3ec90d5743"

RPROVIDES:${PN} += "suseconnect-ruby-bindings"

RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
