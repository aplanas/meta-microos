SUMMARY = "A small utility which generates Go code from any file"
DESCRIPTION = "This package converts any file into manageable Go source code. Useful for embedding binary data into a go program. The file data is optionally gzip compressed before being converted to a raw byte slice. \
 \
It comes with a command line tool in the go-bindata sub directory. This tool offers a set of command line options, used to customize the output being generated."
LICENSE = "CC0-1.0"

PV = "3.0.7+git20151023.72.a0ff256"

RPM_NAME = "golang-github-jteeuwen-go-bindata-3.0.7+git20151023.72.a0ff256-5.12.aarch64.rpm"
RPM_HASH = "4a2bce69a93ea65d830ba5989cfa58df971a3219eeb9bf1408556e5949f0d9c5e0d30b7764c87b14fd8c255c03f5f7b0b477fe62df2ac6893e3b9fe14b0a0538"

RPROVIDES:${PN} += "go-bindata \
golang(github.com/jteeuwen/go-bindata) \
golang-github-jteeuwen-go-bindata \
golang-github-jteeuwen-go-bindata(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
