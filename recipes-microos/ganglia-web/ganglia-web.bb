SUMMARY = "Ganglia web frontend"
DESCRIPTION = "This package provides a web frontend to display the XML tree published by \
ganglia, and to provide historical graphs of collected metrics. This website is \
written in the PHP5/7 language and uses the Dwoo templating engine."
LICENSE = "BSD-3-Clause"

PV = "3.7.5"

RPM_NAME = "ganglia-web-3.7.5-2.2.noarch.rpm"
RPM_HASH = "f3d591b628706c86cf869ad67d1ade2d901ac73c8acf97de4079c810a8370423dfb364ec221fb805a07ebdd8ab7c582ba6265998e8686e06671269719f7a4f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ganglia-web) \
ganglia-web"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
apache2 \
mod_php_any \
php \
php-gd \
php-xml \
rrdtool"

inherit rpm
