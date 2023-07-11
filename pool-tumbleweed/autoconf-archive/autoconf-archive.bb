SUMMARY = "A Collection of macros for GNU autoconf"
DESCRIPTION = "The GNU Autoconf Archive is a collection of more than 450 macros for `GNU \
Autoconf <http://www.gnu.org/software/autoconf>`_ that have been contributed as \
free software by friendly supporters of the cause from all over the Internet. \
Every single one of those macros can be re-used without imposing any \
restrictions whatsoever on the licensing of the generated `configure` script. In \
particular, it is possible to use all those macros in `configure` scripts that \
are meant for non-free software. This policy is unusual for a Free Software \
Foundation project. The FSF firmly believes that software ought to be free, and \
software licenses like the GPL are specifically designed to ensure that \
derivative work based on free software must be free as well. In case of \
Autoconf, however, an exception has been made, because Autoconf is at such a \
pivotal position in the software development tool chain that the benefits from \
having this tool available as widely as possible outweigh the disadvantage that \
some authors may choose to use it, too, for proprietary software."
LICENSE = "GPL-3.0-or-later-with-Autoconf-exception-3.0"

PV = "2023.02.20"

RPM_NAME = "autoconf-archive-2023.02.20-1.4.noarch.rpm"
RPM_HASH = "4a84dd7f9d73a53dbb37c8d9bd513e6fce7dd8b9e09f9cb81dc80ac19e24f826e59bac1fd731008b9a1620979ab9d01bf3b6854ba98bcd8dd82c218999f29cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf-archive"

RDEPENDS:${PN} += ""

inherit rpm
