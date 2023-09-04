SUMMARY = "Mojolicious ♥ Webpack"
DESCRIPTION = "Mojolicious::Plugin::Webpack is a Mojolicious plugin to make it easier to \
work with https://webpack.js.org/ or https://rollupjs.org/. This plugin \
will... \
 \
* 1. \
 \
Generate a minimal 'package.json' and a Webpack or Rollup config file. \
Doing this manually is possible, but it can be quite time consuming to \
figure out all the bits and pieces if you are not already familiar with \
Webpack. \
 \
* 2."
LICENSE = "Artistic-2.0"

PV = "1.02"

RPM_NAME = "perl-Mojolicious-Plugin-Webpack-1.02-1.4.noarch.rpm"
RPM_HASH = "4099d3a4e176967561d78b558d41cee5a5b361d9268bdc2a72b0ab7320d32cdae7c3e14c81b48ca7b223c3134e066a711de73bdef3f25889891b068f788aa513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Alien--npm \
perl-Mojo--Alien--rollup \
perl-Mojo--Alien--webpack \
perl-Mojolicious--Command--Author--webpack \
perl-Mojolicious--Plugin--Webpack \
perl-Mojolicious-Plugin-Webpack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--chdir \
perl-Mojolicious"

inherit rpm
