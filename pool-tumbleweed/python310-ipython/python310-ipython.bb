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

PV = "8.13.2"

RPM_NAME = "python310-ipython-8.13.2-1.1.noarch.rpm"
RPM_HASH = "a9e5dc392f7295ed5c5520b080b6bb0a1e2c2fb1e8cd6fc06509018d89819e5d85a1a1b83c44145b90fbfb9ab3231c1e40d97394fe61fc51416611f52eb595c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 \
jupyter-ipython \
python3-IPython \
python3-ipython \
python3-ipython-doc \
python3-jupyter-ipython \
python3-jupyter-ipython-doc \
python3-jupyter-ipython-doc-html \
python3-jupyter-ipython-doc-pdf \
python3.10dist-ipython \
python310-IPython \
python310-ipython \
python310-ipython-doc \
python310-jupyter-ipython \
python310-jupyter-ipython-doc \
python310-jupyter-ipython-doc-html \
python310-jupyter-ipython-doc-pdf \
python3dist-ipython"

RDEPENDS:${PN} += "-python310-prompt-toolkit >= 3.0.38 with python310-prompt-toolkit < 3.1 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310 \
python310-backcall \
python310-decorator \
python310-jedi \
python310-matplotlib-inline \
python310-pexpect \
python310-pickleshare \
python310-pygments \
python310-stack-data \
python310-traitlets"

inherit rpm
