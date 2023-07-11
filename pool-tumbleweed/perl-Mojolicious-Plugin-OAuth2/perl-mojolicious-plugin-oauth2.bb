SUMMARY = "Auth against OAuth2 APIs including OpenID Connect"
DESCRIPTION = "This Mojolicious plugin allows you to easily authenticate against a at \
http://oauth.net or at https://openid.net/connect/ provider. It includes \
configurations for a few popular providers, but you can add your own as \
well. \
 \
See register for a full list of bundled providers."
LICENSE = "Artistic-2.0"

PV = "2.02"

RPM_NAME = "perl-Mojolicious-Plugin-OAuth2-2.02-1.8.noarch.rpm"
RPM_HASH = "ce51203db1b420091096e7cebd8fe4fc237347988813eba3da77ee987fcb4e8aca7261ca387b0074679d38cd970b9f834c654340862ca01374c5c094d4aa5cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--OAuth2 \
perl-Mojolicious--Plugin--OAuth2--Mock \
perl-Mojolicious-Plugin-OAuth2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--SSL \
perl-Mojolicious"

inherit rpm
