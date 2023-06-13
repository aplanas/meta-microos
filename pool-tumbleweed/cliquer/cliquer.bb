SUMMARY = "C routines for finding cliques in graphs"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph. It uses an exact branch-and-bound algorithm. \
Features: \
 \
  * support for both weighted and unweighted graphs (faster routines \
    for unweighted graphs) \
  * search for maximum clique / maximum-weight clique \
  * search for clique with size / weight within a given range \
  * restrict search to maximal cliques \
  * store found cliques in memory \
  * call a user-defined function for every clique found \
  * Cliquer is re-entrant, so you can use the clique-searching \
    functions from within the callback function"
LICENSE = "GPL-2.0-or-later"

PV = "1.22"

RPM_NAME = "cliquer-1.22-2.7.aarch64.rpm"
RPM_HASH = "3438708557ffed103032ac72a9bdb085cc79624d8ea34e8d73c487874e2ea4909f317ef23d9cf821380fa0b24ba1369bef504c37b3f67509c9ad4cdff16f29f6"

RPROVIDES:${PN} += "cliquer \
cliquer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcliquer.so.1()(64bit)"

inherit rpm
