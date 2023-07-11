SUMMARY = "Documentation for the LilyPond Typesetter (zh)"
DESCRIPTION = "Chinese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-zh-2.24.1-2.4.noarch.rpm"
RPM_HASH = "6c2a78fbb80d2acd50f0943d91905b127e8268601f3ed638ca3ed0d83886f4feb01dff4ba23334caaf2fb2f7d261d8140fe14f5259ce800c72a421f9849c2cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-zh"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
