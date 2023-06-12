SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python310-alabaster-0.7.13-2.1.noarch.rpm"
RPM_HASH = "befce1a08a65221b413ab269c995bbcf2f72e1dca4e4ba80c1270831a4f45328171611810d5c377ffd0ed06e9ee35f9aa777e9808eacae60d33d9fb017de325e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alabaster \
python3.10dist(alabaster) \
python310-alabaster \
python3dist(alabaster)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
