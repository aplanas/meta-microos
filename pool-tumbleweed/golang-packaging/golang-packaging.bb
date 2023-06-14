SUMMARY = "A toolchain to help packaging golang"
DESCRIPTION = "A toolchain to help packaging golang, written in bash."
LICENSE = "GPL-3.0-only"

PV = "15.0.17"

RPM_NAME = "golang-packaging-15.0.17-2.2.noarch.rpm"
RPM_HASH = "3fd049a7dbbc326ef81d8280003e7521200a1288450063d2a9c734557c90e5f92d2c008ae021be4a6bac955c782dfcbdd4cea06ec4401b03e773d944f56c21f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-packaging \
rpm-macro-go-api-ver \
rpm-macro-go-arch \
rpm-macro-go-bindir \
rpm-macro-go-contribdir \
rpm-macro-go-contribsrcdir \
rpm-macro-go-dir \
rpm-macro-go-exclusivearch \
rpm-macro-go-nostrip \
rpm-macro-go-provides \
rpm-macro-go-sitearch \
rpm-macro-go-sitedir \
rpm-macro-go-srcdir \
rpm-macro-go-tooldir \
rpm-macro-go-ver \
rpm-macro-gobuild \
rpm-macro-godoc \
rpm-macro-gofilelist \
rpm-macro-goinstall \
rpm-macro-goprep \
rpm-macro-gosrc \
rpm-macro-gotest"

RDEPENDS:${PN} += "/usr/bin/env \
go"

inherit rpm
