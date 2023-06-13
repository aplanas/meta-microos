SUMMARY = "Single-File Public Domain Libraries for C/C++"
DESCRIPTION = "Useful functions provided via C header files: \
 \
stb_vorbis.h                | audio            | decode ogg vorbis files from file/memory to float/16-bit signed output \
stb_image.h                 | graphics         | image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC \
stb_truetype.h              | graphics         | parse, decode, and rasterize characters from truetype fonts \
stb_image_write.h           | graphics         | image writing to disk: PNG, TGA, BMP \
stb_image_resize.h          | graphics         | resize images larger/smaller with good quality \
stb_rect_pack.h             | graphics         | simple 2D rectangle packer with decent quality \
stb_sprintf.h               | utility          | fast sprintf, snprintf for C/C++ \
stretchy_buffer.h           | utility          | typesafe dynamic array for C (i.e. approximation to vector<>), doesn't compile as C++ \
stb_textedit.h              | user interface   | guts of a text editor for games etc implementing them from scratch \
stb_voxel_render.h          | 3D graphics      | Minecraft-esque voxel rendering 'engine' with many more features \
stb_dxt.h                   | 3D graphics      | Fabian 'ryg' Giesen's real-time DXT compressor \
stb_perlin.h                | 3D graphics      | revised Perlin noise (3D input, 1D output) \
stb_easy_font.h             | 3D graphics      | quick-and-dirty easy-to-deploy bitmap font for printing frame rate, etc \
stb_tilemap_editor.h        | game dev         | embeddable tilemap editor \
stb_herringbone_wang_tile.h | game dev         | herringbone Wang tile map generator \
stb_c_lexer.h               | parsing          | simplify writing parsers for C-like languages \
stb_divide.h                | math             | more useful 32-bit modulus e.g. 'euclidean divide' \
stb_connected_components.h  | misc             | incrementally compute reachability on grids \
stb.h                       | misc             | helper functions for C, mostly redundant in C++; basically author's personal stuff \
stb_leakcheck.h             | misc             | quick-and-dirty malloc/free leak-checking"
LICENSE = "MIT | Unlicense"

PV = "20210910"

RPM_NAME = "stb-devel-20210910-1.5.noarch.rpm"
RPM_HASH = "ddea816979b5923897defebbc40cd8fc4fcc2f5080658f9b2eafd91b976b920590924cf719390b5f1de19438a02148e0d7bb9fcf8670b9f02f425cc575a13705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stb-devel"

RDEPENDS:${PN} += ""

inherit rpm
