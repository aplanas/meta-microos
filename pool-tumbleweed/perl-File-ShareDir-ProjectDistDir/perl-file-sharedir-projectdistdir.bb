SUMMARY = "Simple set-and-forget using of a '/share' directory in your projects root"
DESCRIPTION = "Simple set-and-forget using of a '/share' directory in your projects root"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.000009"

RPM_NAME = "perl-File-ShareDir-ProjectDistDir-1.000009-1.23.noarch.rpm"
RPM_HASH = "023ff88f6fa7c553f294a657ce65e4ac9a460a5438e3d3cf1c014b16f63b7bbd45a38230c805a3afa8eaf1c70e4a52fd0aa3c990639e797c6a739e15d8d9ba4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::ShareDir::ProjectDistDir) \
perl-File-ShareDir-ProjectDistDir"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir) \
perl(Path::FindDev) \
perl(Path::IsDev) \
perl(Path::Tiny) \
perl(Sub::Exporter)"

inherit rpm
