SUMMARY = "The Scientific Python Development Environment"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
It features a combination of the editing, analysis, debugging \
and profiling functionality of a development tool with the \
data exploration, interactive execution, deep inspection and \
visualization capabilities of an analysis package. Additionally, \
Spyder offers built-in integration with scientific \
libraries, including NumPy, SciPy, Pandas, IPython, QtConsole, \
Matplotlib, SymPy, and more, and can be extended further with \
full plugin support."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "spyder-5.4.4-1.1.noarch.rpm"
RPM_HASH = "5fe6582cf18a3240ba13fab8323b5b1a93065070e6e4f8f40e15a545999811997fba2aa1953161b3170a5eec5cc7c345ae9a30a7bc0cada80a5e793896dd632c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder \
python3-spyderlib \
python3.11dist-spyder \
python3dist-spyder \
spyder \
spyder3 \
spyder3-breakpoints \
spyder3-profiler \
spyder3-pylint"

RDEPENDS:${PN} += "-python3-QDarkStyle >= 3.0.2 with python3-QDarkStyle < 3.2.0 \
-python3-ipython >= 7.31.1 with python3-ipython < 9 \
-python3-pylint >= 2.5.0 with python3-pylint < 3 \
-python3-python-lsp-black >= 1.2.0 with python3-python-lsp-black < 3 \
-python3-python-lsp-server >= 1.7.4 with python3-python-lsp-server < 1.8 \
-python3-qtconsole >= 5.4.2 with python3-qtconsole < 5.5.0 \
-python3-spyder-kernels >= 2.4.4 with python3-spyder-kernels < 2.5 \
/usr/bin/bash \
/usr/bin/python3.11 \
cookiecutter \
python-abi \
python3-Pygments \
python3-QtAwesome \
python3-QtPy \
python3-Rtree \
python3-Sphinx \
python3-atomicwrites \
python3-autopep8 \
python3-chardet \
python3-cloudpickle \
python3-diff-match-patch \
python3-flake8 \
python3-intervaltree \
python3-jedi \
python3-jellyfish \
python3-jsonschema \
python3-keyring \
python3-mccabe \
python3-nbconvert \
python3-numpydoc \
python3-parso \
python3-pexpect \
python3-pickleshare \
python3-psutil \
python3-pycodestyle \
python3-pydocstyle \
python3-pyflakes \
python3-pylint-venv \
python3-pyls-spyder \
python3-pyxdg \
python3-pyzmq \
python3-qstylizer \
python3-qt5 \
python3-qtwebengine-qt5 \
python3-rope \
python3-setuptools \
python3-textdistance \
python3-three-merge \
python3-watchdog \
python3-whatthepatch \
python3-yapf \
spyder-lang"

inherit rpm
