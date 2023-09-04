SUMMARY = "Auth against OAuth2 APIs including OpenID Connect"
DESCRIPTION = "This Mojolicious plugin allows you to easily authenticate against a at \
http://oauth.net or at https://openid.net/connect/ provider. It includes \
configurations for a few popular providers, but you can add your own as \
well. \
 \
See register for a full list of bundled providers."
LICENSE = "Artistic-2.0"

PV = "2.02"

RPM_NAME = "perl-Mojolicious-Plugin-OAuth2-2.02-1.9.noarch.rpm"
RPM_HASH = "8e8ca576528f98ce7f56c7f6bea963edf4ac345e9591633e013e8a9e12293ef63434292a728e04f5aa62a161419f3b8ee2d44785a3f6abd38588b981e7e25a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--OAuth2 \
perl-Mojolicious--Plugin--OAuth2--Mock \
perl-Mojolicious-Plugin-OAuth2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--SSL \
perl-Mojolicious"

inherit rpm
