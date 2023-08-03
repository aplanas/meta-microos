SUMMARY = "Documentation for texlive-endofproofwd"
DESCRIPTION = "This package includes the documentation for texlive-endofproofwd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55643"

RPM_NAME = "texlive-endofproofwd-doc-2023.209.svn55643-54.1.noarch.rpm"
RPM_HASH = "d7334c15aee20b337fc2f96dd22cc605a4abb4bb959f57cab0e089fa4a784c3df05c0883bb7c4f0f32385775b1f649adf20102aaf7136cf93691c76ae75b5fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endofproofwd-doc"

RDEPENDS:${PN} += ""

inherit rpm
