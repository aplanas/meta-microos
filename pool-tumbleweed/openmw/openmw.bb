SUMMARY = "Reimplementation of The Elder Scrolls III: Morrowind"
DESCRIPTION = "OpenMW is a new and modern engine based on the one that runs the 2002 open-world RPG Morrowind. The engine (OpenMW) will come with its own editor (OpenCS) which will allow the user to edit or create their own games. Both OpenCS and OpenMW are written from scratch and aren’t made to support any third party programs the original Morrowind engine uses to improve its functionality. \
To give you a better idea of what this project is about, here are some of the aims for the future of the OpenMW engine: \
 \
  * Be a full-featured reimplementation of the Morrowind engine. \
  * Run natively on Windows, Linux and MacOS X. \
  * Support all existing content, including Tribunal, Bloodmoon and all user created mods (in case they don’t \
     use external programs). \
  * Allow much greater modability: change game rules, create new spell effects, etc. through scripting. \
  * Fix system design bugs, like save-game “doubling” problem. \
  * Improve the interface and journal system. \
  * Improved graphics by taking advantage of more modern hardware. \
  * Support to improve game mechanics, physics, combat and AI. \
  * (Possibly) Support to implement multiplayer \
  * (Possibly) Support to run on mobile devices. \
 \
NOTE(!!!): Playing Morrowind with this engine STILL REQUIRES one to own the Morrowind data files. \
 \
OpenCS will support the editing of all OpenMW features. We aim for the editor to stay fully up-to-date with the corresponding OpenMW version, allowing the user to edit any newly implemented features. Post v1.0 features are going to be the use of OpenCS as a debugging tool for OpenMW content and the support for editor plugins. \
These are files that add to the editor code, improving its functionality to allow it to have some nice extras. \
The OpenCS is not based on the editing tool which came with the original Morrowind game, it is a program made by modders for modders. Important properties of the OpenCS are: \
 \
 * non-blocking \
 * multi-threaded \
 * multi-document support \
 * multi-view support \
 * high scalability \
 * customisable GUI"
LICENSE = "GPL-3.0-only & MIT"

PV = "0.48.0~rc9"

RPM_NAME = "openmw-0.48.0~rc9-1.3.aarch64.rpm"
RPM_HASH = "081b18556a12ee3679c7dfb1a7414d5d8e5d4f8b5204ed3be9120f3e7c3f605ba8bc506cbc9890621b57af525c343c799ab405464e9eaf0ebbb077ba5ddb0e8c"

RPROVIDES:${PN} += "config-openmw \
openmw"

RDEPENDS:${PN} += "/bin/sh \
OpenSceneGraph-plugins \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libDebugUtils.so.1 \
libDetour.so.1 \
libGL.so.1 \
libLinearMath.so.3.17 \
libMyGUIEngine.so.3.4.1 \
libOpenThreads.so.21 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libRecast.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libluajit-5.1.so.2 \
liblz4.so.1 \
libm.so.6 \
libopenal.so.1 \
libosg.so.161 \
libosgAnimation.so.161 \
libosgDB.so.161 \
libosgFX.so.161 \
libosgGA.so.161 \
libosgParticle.so.161 \
libosgShadow.so.161 \
libosgText.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libsqlite3.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libtinyxml.so.0 \
libunshield.so.0 \
libyaml-cpp.so.0.7"

inherit rpm
