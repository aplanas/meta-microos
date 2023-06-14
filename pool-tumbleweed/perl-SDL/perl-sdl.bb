SUMMARY = "SDL bindings to Perl"
DESCRIPTION = "SDL Perl are a set of bindings to the Simple DirectMedia Layer (SDL). \
 \
Simple DirectMedia Layer is a cross-platform multimedia library designed to \
provide low level access to audio, keyboard, mouse, joystick, 3D hardware via \
OpenGL, and 2D video framebuffer. It is used by MPEG playback software, \
emulators, and many popular games, including the award winning Linux port of \
'Civilization: Call To Power.'"
LICENSE = "LGPL-2.1-or-later"

PV = "2.548"

RPM_NAME = "perl-SDL-2.548-5.3.aarch64.rpm"
RPM_HASH = "3f54c3282dfa8eb0e6b89b81c8b5db543f3ff98e4013c1642e6b7123d9e03c80eb52b1e1e933ee84e7319e81895c45c6e1f1e06a84806590620e784c917354c1"

RPROVIDES:${PN} += "perl-Module--Build--SDL \
perl-SDL \
perl-SDL--Audio \
perl-SDL--AudioCVT \
perl-SDL--AudioSpec \
perl-SDL--CD \
perl-SDL--CDROM \
perl-SDL--CDTrack \
perl-SDL--Color \
perl-SDL--Config \
perl-SDL--ConfigData \
perl-SDL--Constants \
perl-SDL--Cursor \
perl-SDL--Event \
perl-SDL--Events \
perl-SDL--GFX \
perl-SDL--GFX--BlitFunc \
perl-SDL--GFX--FPSManager \
perl-SDL--GFX--Framerate \
perl-SDL--GFX--ImageFilter \
perl-SDL--GFX--Primitives \
perl-SDL--GFX--Rotozoom \
perl-SDL--Image \
perl-SDL--Internal--Loader \
perl-SDL--Joystick \
perl-SDL--Mixer \
perl-SDL--Mixer--Channels \
perl-SDL--Mixer--Effects \
perl-SDL--Mixer--Groups \
perl-SDL--Mixer--MixChunk \
perl-SDL--Mixer--MixMusic \
perl-SDL--Mixer--Music \
perl-SDL--Mixer--Samples \
perl-SDL--Mouse \
perl-SDL--MultiThread \
perl-SDL--Net \
perl-SDL--Net--IPaddress \
perl-SDL--Net--TCP \
perl-SDL--Net--UDP \
perl-SDL--Overlay \
perl-SDL--Palette \
perl-SDL--Pango \
perl-SDL--Pango--Context \
perl-SDL--PixelFormat \
perl-SDL--RWOps \
perl-SDL--Rect \
perl-SDL--SMPEG \
perl-SDL--SMPEG--Info \
perl-SDL--Surface \
perl-SDL--TTF \
perl-SDL--TTF--Font \
perl-SDL--TTFont \
perl-SDL--Time \
perl-SDL--Tutorial \
perl-SDL--Tutorial--Animation \
perl-SDL--Tutorial--LunarLander \
perl-SDL--Version \
perl-SDL--Video \
perl-SDL--VideoInfo \
perl-SDL-perl \
perl-SDLx--App \
perl-SDLx--Controller \
perl-SDLx--Controller--Interface \
perl-SDLx--Controller--State \
perl-SDLx--Controller--Timer \
perl-SDLx--FPS \
perl-SDLx--Layer \
perl-SDLx--LayerManager \
perl-SDLx--Music \
perl-SDLx--Music--Data \
perl-SDLx--Music--Default \
perl-SDLx--Rect \
perl-SDLx--SFont \
perl-SDLx--Sound \
perl-SDLx--Sprite \
perl-SDLx--Sprite--Animated \
perl-SDLx--Surface \
perl-SDLx--Surface--TiedMatrix \
perl-SDLx--Surface--TiedMatrixRow \
perl-SDLx--TTF \
perl-SDLx--Text \
perl-SDLx--Validate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-Pango.so.1 \
libSDL-gfx.so.15 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-CPAN \
perl-File--ShareDir \
perl-Tie--Simple"

inherit rpm
