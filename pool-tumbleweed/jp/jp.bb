SUMMARY = "JSON/CSV data plotting program for the terminal"
DESCRIPTION = "This program generates terminal plots from JSON (or CSV) data. Bar charts, \
line charts, scatter plots, histograms and heatmaps are supported."
LICENSE = "MIT"

PV = "1.1.12"

RPM_NAME = "jp-1.1.12-2.9.aarch64.rpm"
RPM_HASH = "49af30869e3ac26e2bf4dcbb89769a95e4b7e36c5c08267a3b52ac1dbbbc707a3d72fc1a9c05898e896da640d75eb5aa917869904bf7dfe26f47194a30956f61"

RPROVIDES:${PN} += "golang-github.com/sgreben/jp/cmd/jp \
golang-github.com/sgreben/jp/pkg/data \
golang-github.com/sgreben/jp/pkg/draw \
golang-github.com/sgreben/jp/pkg/jsonpath \
golang-github.com/sgreben/jp/pkg/plot \
golang-github.com/sgreben/jp/pkg/terminal \
jp"

RDEPENDS:${PN} += ""

inherit rpm
