SUMMARY = "Translations for package ciano"
DESCRIPTION = "Provides translations for the 'ciano' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-lang-0.2.4-1.21.noarch.rpm"
RPM_HASH = "29efa3a7d09bcdcd02c50cc54ca6fa12532760e7d3647d41db7348ed16c32e99c6f26253d065ccbffd8bd552006ef82a86506048d613bf7a423745f2fa84ba34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ciano-lang ciano-lang-all locale(ciano:da) locale(ciano:es) locale(ciano:fr) locale(ciano:lt) locale(ciano:nl) locale(ciano:pt) locale(ciano:pt_BR) locale(ciano:tr) locale(ciano:zh_CN)"
RDEPENDS:${PN} += "ciano"

inherit rpm
