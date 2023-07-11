SUMMARY = "Documentation for mod_auth_mellon module"
DESCRIPTION = "This package contains a documentation for mod_auth_mellon module."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-doc-0.17.0-2.10.aarch64.rpm"
RPM_HASH = "23fd1de1a8011b0b1fa085eb951c7ca57d53e3bfd647f6d6fdb2eec3aca321eab534fb1f01d13d358d3b24f3dacfd284e2aded2198d33ff9f83d0aa8168b2aef"

RPROVIDES:${PN} += "apache2-mod-auth-mellon-doc"

RDEPENDS:${PN} += "apache2-mod-auth-mellon"

inherit rpm
