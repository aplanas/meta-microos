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

RPM_NAME = "python311-ipython-8.14.0-1.3.noarch.rpm"
RPM_HASH = "fda010e053813069e72477f7cb0db3c8e8b72f5760f80ab0f943b8ed60f23850d5757c155b9c849162fc2c6140cba9212515ecd3b77a42fedbab21db7001f371"
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
python3.11dist-ipython \
python311-IPython \
python311-ipython \
python311-ipython-doc \
python311-jupyter-ipython \
python311-jupyter-ipython-doc \
python311-jupyter-ipython-doc-html \
python311-jupyter-ipython-doc-pdf \
python3dist-ipython"

RDEPENDS:${PN} += "-python311-prompt-toolkit >= 3.0.38 with python311-prompt-toolkit < 3.1 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311 \
python311-backcall \
python311-decorator \
python311-jedi \
python311-matplotlib-inline \
python311-pexpect \
python311-pickleshare \
python311-pygments \
python311-stack-data \
python311-traitlets"

inherit rpm
