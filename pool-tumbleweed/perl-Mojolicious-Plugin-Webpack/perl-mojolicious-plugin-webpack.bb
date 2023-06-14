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

RPM_NAME = "perl-Mojolicious-Plugin-Webpack-1.02-1.2.noarch.rpm"
RPM_HASH = "d51046496c1f2eb29191fa0a190fc6608655b07bc0e482b3bc98e19dfae49640a3adaa53963b9fdae4f69009be2b6abd8fdea992a05506b3b7f9af2bd3c486e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Alien--npm \
perl-Mojo--Alien--rollup \
perl-Mojo--Alien--webpack \
perl-Mojolicious--Command--Author--webpack \
perl-Mojolicious--Plugin--Webpack \
perl-Mojolicious-Plugin-Webpack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--chdir \
perl-Mojolicious"

inherit rpm
