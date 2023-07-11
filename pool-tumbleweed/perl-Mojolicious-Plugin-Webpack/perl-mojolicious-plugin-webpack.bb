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

RPM_NAME = "perl-Mojolicious-Plugin-Webpack-1.02-1.3.noarch.rpm"
RPM_HASH = "35464e97392f9492b7fb27d08a4437b886c37b749c6ef8b6235f422320c25f132ad7be519c45974ee74a0278786735ca1c61caa00599c59b899e63df355c85a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Alien--npm \
perl-Mojo--Alien--rollup \
perl-Mojo--Alien--webpack \
perl-Mojolicious--Command--Author--webpack \
perl-Mojolicious--Plugin--Webpack \
perl-Mojolicious-Plugin-Webpack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--chdir \
perl-Mojolicious"

inherit rpm
