SUMMARY = "A small utility which generates Go code from any file"
DESCRIPTION = "This package converts any file into manageable Go source code. Useful for embedding binary data into a go program. The file data is optionally gzip compressed before being converted to a raw byte slice. \
 \
It comes with a command line tool in the go-bindata sub directory. This tool offers a set of command line options, used to customize the output being generated."
LICENSE = "CC0-1.0"

PV = "3.0.7+git20151023.72.a0ff256"

RPM_NAME = "golang-github-jteeuwen-go-bindata-3.0.7+git20151023.72.a0ff256-5.13.aarch64.rpm"
RPM_HASH = "06c3b46a16f45113fe73c87582ad67be2f5dbf95eef332b8e1709d4b50f3d60eedfd9d788257187ec4b9f13da6b089cfd9da8f88afe0f1e5c9123184f0c12ade"

RPROVIDES:${PN} += "go-bindata \
golang-github-jteeuwen-go-bindata \
golang-github.com/jteeuwen/go-bindata"

RDEPENDS:${PN} += ""

inherit rpm
