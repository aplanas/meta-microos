SUMMARY = "A toolchain to help packaging golang"
DESCRIPTION = "A toolchain to help packaging golang, written in bash."
LICENSE = "GPL-3.0-only"

PV = "15.0.17"

RPM_NAME = "golang-packaging-15.0.17-2.2.noarch.rpm"
RPM_HASH = "3fd049a7dbbc326ef81d8280003e7521200a1288450063d2a9c734557c90e5f92d2c008ae021be4a6bac955c782dfcbdd4cea06ec4401b03e773d944f56c21f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-packaging \
rpm_macro(go_api_ver) \
rpm_macro(go_arch) \
rpm_macro(go_bindir) \
rpm_macro(go_contribdir) \
rpm_macro(go_contribsrcdir) \
rpm_macro(go_dir) \
rpm_macro(go_exclusivearch) \
rpm_macro(go_nostrip) \
rpm_macro(go_provides) \
rpm_macro(go_sitearch) \
rpm_macro(go_sitedir) \
rpm_macro(go_srcdir) \
rpm_macro(go_tooldir) \
rpm_macro(go_ver) \
rpm_macro(gobuild) \
rpm_macro(godoc) \
rpm_macro(gofilelist) \
rpm_macro(goinstall) \
rpm_macro(goprep) \
rpm_macro(gosrc) \
rpm_macro(gotest)"
RDEPENDS:${PN} += "/usr/bin/env \
go"

inherit rpm
