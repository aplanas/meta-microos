SUMMARY = "Documentation and examples for the Qore openldap module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
openldap module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "qore-openldap-module-doc-1.2.3-2.1.aarch64.rpm"
RPM_HASH = "b30a316360c73df05f1ed0c1e07c38354730bfd599d8608aad47ce6d1fff4255f22f7189901154a9d8217d026120b2362da513a7be0f8f75a852b73e3b05470b"

RPROVIDES:${PN} += "qore-openldap-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
