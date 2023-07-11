SUMMARY = "Rich architecture for interactive computing with Python"
DESCRIPTION = "IPython provides a rich toolkit to help you make the \
most out of using Python interactively. Its main \
components are: \
 \
 * A powerful interactive Python shell \
 * A Jupyter kernel to work with Python code in \
   Jupyter notebooks and other interactive frontends. \
 \
The enhanced interactive Python shells have the \
following main features: \
 \
 * Comprehensive object introspection. \
 * Input history, persistent across sessions. \
 * Caching of output results during a session with automatically \
   generated references. \
 * Extensible tab completion, with support by default for completion \
   of python variables and keywords, filenames and function keywords. \
 * Extensible system of ‘magic’ commands for controlling the \
   environment and performing many tasks related either to IPython or \
   the operating system. \
 * A rich configuration system with easy switching between different \
   setups (simpler than changing $PYTHONSTARTUP environment variables \
   every time). \
 * Session logging and reloading. \
 * Extensible syntax processing for special purpose situations. \
 * Access to the system shell with user-extensible alias system. \
 * Easily embeddable in other Python programs and GUIs. \
 * Integrated access to the pdb debugger and the Python profiler."
LICENSE = "BSD-3-Clause"

PV = "8.14.0"

RPM_NAME = "python39-ipython-8.14.0-1.3.noarch.rpm"
RPM_HASH = "b118a3aeba94daef04b5e9515c3b9753398cce9c6ce0962bcf6b909904718ccd606d5181a0a659cae344709191d8180dc5ca72b4cecf631f2dd780a386c1097a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 \
jupyter-ipython \
python3.9dist-ipython \
python39-IPython \
python39-ipython \
python39-ipython-doc \
python39-jupyter-ipython \
python39-jupyter-ipython-doc \
python39-jupyter-ipython-doc-html \
python39-jupyter-ipython-doc-pdf \
python3dist-ipython"

RDEPENDS:${PN} += "-python39-prompt-toolkit >= 3.0.38 with python39-prompt-toolkit < 3.1 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39 \
python39-backcall \
python39-decorator \
python39-jedi \
python39-matplotlib-inline \
python39-pexpect \
python39-pickleshare \
python39-pygments \
python39-stack-data \
python39-traitlets \
python39-typing-extensions"

inherit rpm
