SUMMARY = "Scandir, a better directory iterator and faster oswalk"
DESCRIPTION = "``scandir()`` is a directory iteration function like ``os.listdir()``, \
except that instead of returning a list of bare filenames, it yields \
``DirEntry`` objects that include file type and stat information along \
with the name. Using ``scandir()`` increases the speed of ``os.walk()`` \
by 2-20 times (depending on the platform and file system) by avoiding \
unnecessary calls to ``os.stat()`` in most cases. \
 \
``scandir`` has been included in the Python 3.5 standard library as \
``os.scandir()``, and the related performance improvements to \
``os.walk()`` have also been included. So if you're lucky enough to be \
using Python 3.5 (release date September 13, 2015) you get the benefit \
immediately, otherwise just \
`download this module from PyPI <https://pypi.python.org/pypi/scandir>`_, \
install it with ``pip install scandir``, and then do something like \
this in your code:: \
 \
     \
     \
    try: \
        from os import scandir, walk \
    except ImportError: \
        from scandir import scandir, walk \
 \
`PEP 471 <https://www.python.org/dev/peps/pep-0471/>`_, which is the \
PEP that proposes including ``scandir`` in the Python standard library, \
was `accepted <https://mail.python.org/pipermail/python-dev/2014-July/135561.html>`_ \
in July 2014 by Victor Stinner, the BDFL-delegate for the PEP. \
 \
This ``scandir`` module is intended to work on Python 2.6+ and Python \
3.2+ (and it has been tested on those versions)."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python310-scandir-1.10.0-4.1.aarch64.rpm"
RPM_HASH = "ad1bb5d0c1e17110d126a8ebf1a05af496667671d244cc7df89502aab10d9c9d83f0e0cd1ee14fc0ea6205ea1cf613f7707bc3c7a7a939201b2b4d7d31d7315f"

RPROVIDES:${PN} += "python3-scandir \
python3.10dist(scandir) \
python310-scandir \
python310-scandir(aarch-64) \
python3dist(scandir)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
