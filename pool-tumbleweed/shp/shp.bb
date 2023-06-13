SUMMARY = "Like PHP except you write your script in shell script"
DESCRIPTION = "shp parses and executes SHP scripts in the manner of PHP, except nested \
scripts are written in shell scripting language instead of the PHP language. \
shp outputs its script file, with nested <?shp ... ?> blocks executed \
as shell scripts."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "shp-1.0.2-5.16.noarch.rpm"
RPM_HASH = "3dbc1210f9146a793af34591a78cef2506782fe2c7875b99189e13ac582b6f2c06adadb884a71704ee79f043a0db820a2b60868d502c1f4f5bfae69f0ce1fc19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shp"

RDEPENDS:${PN} += "/bin/bash \
bash \
coreutils \
gawk \
openssl"

inherit rpm
